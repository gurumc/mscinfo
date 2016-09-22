/**
 * \file
 * \brief RQ manager object functions.
 */
/*
 * Guru
 */
#pragma once

#include <l4/sys/kernel_object.h>
#include <l4/sys/ipc.h>
//#include "l4/pkg/l4util/include/kprintf.h"
/**
 * \defgroup l4_RQmanager_api Scheduler
 * \ingroup  l4_kernel_object_api
 * \brief RQ manager object.
 *
 * <c>\#include <l4/sys/scheduler.h></c>
 */

/**
 * \brief Scheduler parameter set.
 * \ingroup l4_scheduler_api
 */
typedef struct l4_rq_info_t
{
  unsigned           prio;     ///< Priority for scheduling.
  unsigned           left; ///< Deadline for scheduling (own work).
  unsigned			 temp;
} l4_rq_info_t;



/**
 * \brief Get scheduler information.
 * \ingroup l4_scheduler_api
 *
 * \param scheduler  Scheduler object.
 * \retval cpu_max maximum number of CPUs ever available.
 * \param cpus \a cpus.offset is first CPU of interest.
 *             \a cpus.granularity (see l4_sched_cpu_set_t).
 * \retval cpus \a cpus.map Bitmap of online CPUs.
 *
 * \return 0 on success, <0 error code otherwise.
 */
L4_INLINE l4_rq_info_t
l4_readyqueue_info(l4_cap_idx_t rq_manager) L4_NOTHROW;

L4_INLINE l4_msgtag_t
l4_rqmanager_schedule_thread(l4_cap_idx_t rq_manager,
			l4_cap_idx_t thread, l4_sched_param_t const *sp) L4_NOTHROW;

/**
 * \internal
 */
L4_INLINE l4_msgtag_t
l4_rqmanager_schedule_thread_u(l4_cap_idx_t rq_manager, l4_cap_idx_t thread,
			  l4_sched_param_t const *sp, l4_utcb_t *utcb) L4_NOTHROW;


enum L4_rqmanager_ops
{
  L4_READYQUEUE_INFO_OP       = 0UL, /**< Query infos about the scheduler */
  L4_RQ_SCHEDULE_THREAD_OP = 1UL, /**< Run a thread on this scheduler */
//  L4_SCHEDULER_IDLE_TIME_OP  = 2UL, /**< Query idle time for the scheduler */
//  L4_SCHEDULER_ADD_THREAD_OP = 3UL, /**< Add a thread to the scheduler RQ */
//  L4_SCHEDULER_RQINFO_OP = 4UL,
};

/*************** Implementations *******************/

L4_INLINE l4_rq_info_t
l4_readyqueue_info(l4_cap_idx_t rq_manager) L4_NOTHROW
{
	l4_rq_info_t rq;

	return rq;

}

L4_INLINE l4_msgtag_t
l4_rqmanager_schedule_thread(l4_cap_idx_t rq_manager,
			l4_cap_idx_t thread, l4_sched_param_t const *sp) L4_NOTHROW
{
	return l4_rqmanager_schedule_thread_u(rq_manager, thread, sp, l4_utcb());
}

L4_INLINE l4_msgtag_t
l4_rqmanager_schedule_thread_u(l4_cap_idx_t rq_manager, l4_cap_idx_t thread,
			  l4_sched_param_t const *sp, l4_utcb_t *utcb) L4_NOTHROW
{
	//l4_kprintf("[rq_manager] schedule thread\n\n");
	l4_msg_regs_t *m = l4_utcb_mr_u(utcb);
	  m->mr[0] = L4_RQ_SCHEDULE_THREAD_OP;
	  m->mr[1] = (sp->affinity.granularity << 24) | sp->affinity.offset;
	  m->mr[2] = sp->affinity.map;
	  m->mr[3] = sp->prio;
	  m->mr[4] = sp->quantum;
	  m->mr[5] = sp->deadline; /* Own work */
	//  m->mr[5] = sp->temp;
	//  m->mr[6] = l4_map_obj_control(0, 0);
	//  m->mr[7] = l4_obj_fpage(thread, 0, L4_FPAGE_RWX).raw;

//	  	m->mr[5] = sp->temp;
	    m->mr[6] = l4_map_obj_control(0, 0);
	    m->mr[7] = l4_obj_fpage(thread, 0, L4_FPAGE_RWX).raw;
	  // The second argument of the message tag (here: literal 6) denotes how many message registers to transfer
	  // The third argument of the message tag (here: literal 1) denotes which thread to schedule
	  return l4_ipc_call(rq_manager, utcb, l4_msgtag(L4_PROTO_RQ_MANAGER, 6, 1, 0), L4_IPC_NEVER);
}
