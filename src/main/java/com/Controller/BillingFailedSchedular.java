package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.Entity.TblBillingLogs;
import com.Repository.TblBillingLogsRepo;
import com.Repository.TblBillingRepo;
import com.Service.MainService;

@Component
public class BillingFailedSchedular {

	@Autowired
	TblBillingRepo billingRepo;

	@Autowired
	TblBillingLogsRepo billingLogsRepo;

	@Autowired
	MainService service;

	@Scheduled(fixedDelay = 12540000) // 3 hours 29 minutes in milliseconds
	public void threadForFailed31() {
		try {

			String status = "31";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12600000) // 3 hours 30 minutes in milliseconds
	public void threadForFailed32() {
		try {

			String status = "32";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12660000) // 3 hours 31 minutes in milliseconds
	public void threadForFailed33() {
		try {

			String status = "34";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12720000) // 3 hours 32 minutes in milliseconds
	public void threadForFailed35() {
		try {

			String status = "35";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12780000) // 3 hours 33 minutes in milliseconds
	public void threadForFailed36() {
		try {

			String status = "36";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12840000) // 3 hours 34 minutes in milliseconds
	public void threadForFailed37() {
		try {

			String status = "37";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12900000) // 3 hours 35 minutes in milliseconds
	public void threadForFailed38() {
		try {

			String status = "38";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 12960000) // 3 hours 36 minutes in milliseconds
	public void threadForFailed39() {
		try {

			String status = "39";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Scheduled(fixedDelay = 13020000) // 3 hours 37 Minutes in milliseconds
	public void threadForFailed40() {
		try {

			String status = "40";
			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
			
			System.out.println("The size of Failed Status List is" + billingLogs.size());

			if (billingLogs.size() != 0) {

				if (billingLogs.size() != 0) {
					System.out.println("Control inside Failed Schedulers" + status);

					for (TblBillingLogs logs : billingLogs) {

						service.getRequest(logs);
					}

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

//	@Scheduled(fixedDelay = 13080000) // 3 hours 38 MInutes in milliseconds
//	public void threadForFailed41() {
//		try {
//
//			String status = "41";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13140000) // 3 hours 39 MInutes in milliseconds
//	public void threadForFailed42() {
//		try {
//
//			String status = "42";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13200000) // 3 hours 40 Minutes in milliseconds
//	public void threadForFailed43() {
//		try {
//
//			String status = "43";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13260000) // 3 hours 41 Minutes in milliseconds
//	public void threadForFailed44() {
//		try {
//
//			String status = "44";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13320000) // 3 hours 42 Minutes in milliseconds
//	public void threadForFailed45() {
//		try {
//
//			String status = "45";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13380000) // 3 hours 43 Minutes in milliseconds
//	public void threadForFailed46() {
//		try {
//
//			String status = "46";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13440000) // 3 hours 44 Minutes in milliseconds
//	public void threadForFailed47() {
//		try {
//
//			String status = "47";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13500000) // 3 hours 45 Minutes in milliseconds
//	public void threadForFailed48() {
//		try {
//
//			String status = "48";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13560000) // 3 hours 46 Minutes in milliseconds
//	public void threadForFailed49() {
//		try {
//
//			String status = "49";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	@Scheduled(fixedDelay = 13620000) // 3 hours 47 Minutes in milliseconds
//	public void threadForFailed50() {
//		try {
//
//			String status = "50";
//			List<TblBillingLogs> billingLogs = billingLogsRepo.getForFailed(status);
//			
//			System.out.println("The size of Failed Status List is" + billingLogs.size());
//
//			if (billingLogs.size() != 0) {
//
//				if (billingLogs.size() != 0) {
//					System.out.println("Control inside Failed Schedulers" + status);
//
//					for (TblBillingLogs logs : billingLogs) {
//
//						service.getRequest(logs);
//					}
//
//				}
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
	}
