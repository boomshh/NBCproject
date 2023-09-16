package com.example.hotel

import java.util.Scanner

import java.time.LocalDate
import java.util.*

fun main() {
    val hotel = Hotel()

    while (true) {
        println("----- 호텔 예약 프로그램입니다. -----")
        println("1. 방 예약, 2. 예약 목록 출력, 3. 예약 목록 (정렬) 출력, 4. 시스템 종료, 5. 금액 입금-출금 내 목록 출력 6. 예약 변경/취소")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("성함을 입력하세요:")
                val name = readLine().toString()

                println("방 번호를 입력하세요 (100~999):")
                val roomNumber = readLine()!!.toInt()

                println("체크인 날짜를 입력하세요 (예시: 2023-07-28):")
                val checkInDate = LocalDate.parse(readLine().toString())

                println("체크아웃 날짜를 입력하세요 (예시: 2023-08-01):")
                val checkOutDate = LocalDate.parse(readLine().toString())

                val reservation = hotel.makeReservation(name, roomNumber, checkInDate, checkOutDate)
                if (reservation != null) {
                    println("예약 정보: $reservation")
                }
            }
            2 -> {
                println("----- 호텔 예약자 목록 -----")
                val reservations = hotel.getReservation()
                for (reservation in reservations) {
                    println(reservation)
                }
            }
            3 -> {
                println("----- 체크인 날짜순으로 정렬된 예약자 목록 -----")
                val reservations = hotel.getReservation()
                for (reservation in reservations) {
                    println(reservation)
                }
            }
            4 -> {
                println("프로그램을 종료합니다.")
                return
            }
            else -> {
                println("유효하지 않은 메뉴 번호입니다. 다시 선택해주세요.")
            }
        }
    }
}
