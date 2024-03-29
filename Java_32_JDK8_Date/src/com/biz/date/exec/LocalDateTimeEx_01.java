package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {

	public static void main(String[] args) {
		
		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println("올해 : " + local.getYear());
		System.out.println("이달 : " + local.getMonth());
		System.out.println("오늘 : " + local.getDayOfYear());
		
		System.out.printf("%02d:%02d:%02d\n",
				local.getHour(),
				local.getMinute(),
				local.getSecond()
				);
		

		local.plusDays(3);
		System.out.println(local.plusDays(3).toString()); // +3일
		System.out.println(local.minusDays(3).toString()); // -3일
		System.out.println(local.plusMonths(3).toString()); // +3개월
		System.out.println(local.minusMonths(3).toString()); // -3개월
		
		System.out.println(local.plusHours(3).toString()); // +3시간
		System.out.println(local.minusHours(3).toString()); // -3시간
		
		// 올해 첫날
		System.out.println(local.with(TemporalAdjusters.firstDayOfYear()));
		// 내년 첫날
		System.out.println(local.with(TemporalAdjusters.firstDayOfNextYear()));
		// 올해 마지막날
		System.out.println(local.with(TemporalAdjusters.lastDayOfYear()));
		// 이 달의 첫날
		System.out.println(local.with(TemporalAdjusters.firstDayOfMonth()));
		// 이 달의 마지막날
		System.out.println(local.with(TemporalAdjusters.lastDayOfMonth()));
		// 이 주의 첫번째 날짜
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		// 이 달의 첫번째 일요일 날짜
		System.out.println(local.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
		// 이 달의 마지막 일요리 날짜
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
		// 이 달의 마지막 금요일 날짜
		System.out.println(local.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		// 다음주 일요일
		System.out.println(local.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
		// 오늘 포함해서 다음주 일요일
		// 만약 오늘이 일요일이면 오늘날짜
		System.out.println(local.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));
		// 지난주 일요일
		System.out.println(local.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));
		// 오늘 포함해서 지난주 일요일
		// 만약 오늘이 일요일이면 오늘날짜
		System.out.println(local.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));
		// 임의의 시간 생성
		LocalDateTime makeDateTime = LocalDateTime.now(); // 현재시간이 나오는 코드
		
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(9);
		makeDateTime = makeDateTime.withDayOfMonth(29);
		
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		
		System.out.println(makeDateTime.toString());
		
		
		LocalDateTime t = LocalDateTime.now(); 
		
		int curMonth = t.getMonthValue();
		int p3Month = t.plusMonths(2).getMonthValue();
		
		System.out.printf("%d - %d = %d", p3Month, curMonth, p3Month - curMonth);
		
	}
}
