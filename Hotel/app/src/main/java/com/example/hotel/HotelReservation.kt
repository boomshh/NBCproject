package com.example.hotel

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class HotelReservation (val name: String, val roomNumber: Int, val checkInData: LocalDate, val checkOutDate: LocalDate) {

    fun isValidReservation () : Boolean {
        if (checkInData.isBefore(LocalDate.now())) {
            return false
        }
        if (checkOutDate.isBefore(checkInData)) {
            return false
        }
        return true
    }

    override fun toString() : String {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return "사용자 : $name, 방 번호: $roomNumber, 체크인 : ${checkInData.format(formatter)}, 체크아웃 : ${checkOutDate.format(formatter)}"
    }

}
