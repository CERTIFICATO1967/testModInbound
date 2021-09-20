package it.telecomitalia.trcs.middleware.kafka.inbound.logging;


public class HydraLogThreadLocal {
	
	private static final ThreadLocal<HydraLogBean> threadLocal = new ThreadLocal<>();

	public static HydraLogBean getLogBean() {
		HydraLogBean bean= threadLocal.get();

		if (bean==null) {
			bean = new HydraLogBean();
			threadLocal.set(bean);
		}

		return bean;
	}
}