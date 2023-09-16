package com.example.hotel

import java.time.LocalDate

class Hotel {
    val rooms = mutableListOf<String>()
    val reservations = mutableListOf<HotelReservation>()

    fun addRoom(roomNumber: String) {
        rooms.add(roomNumber)
    }

    fun isRoomVaoilable(roomNumber: Int, checkInDate: LocalDate, checkOutDate: LocalDate) : Boolean {
        for (reservation in reservations) {
            if (reservation.roomNumber == roomNumber && checkInDate.isBefore(reservation.checkOutDate) && checkOutDate
                    .isAfter(reservation.checkInData)
            ) {
                return false
            }
        }
        return true
    }
    fun makeReservation (name:String, roomNumber: Int, checkInDate: LocalDate, checkOutDate: LocalDate): HotelReservation? {
    if (isRoomVaoilable(roomNumber,checkInDate,checkOutDate)) {
        val reservation = HotelReservation(name, roomNumber, checkInDate, checkOutDate)
        reservations.add(reservation)

        println("호텔 예약이 완료되었습니다.")
        return reservation
    } else {
        println("해당 날짜에는 예약이 불가능합니다. 다른 날짜를 골라주세요.")
        return null
    }
    }


    fun getReservation() : List<HotelReservation> {
        return reservations.sortedBy { it.checkInData }
    }
}