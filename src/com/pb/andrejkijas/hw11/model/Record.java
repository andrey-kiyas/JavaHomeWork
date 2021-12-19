package com.pb.andrejkijas.hw11.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Каждый элемент должен иметь:
 * - ФИО
 * - дата рождения
 * - телефоны (количество не ограничено)
 * - адрес
 * - дата и время редактирования
 **/

public class Record implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate doB;
    private List<Phone> phoneList = new ArrayList<>();
    private String address;
    private LocalDate datetimeEdit;

    private Record() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDatetimeEdit() {
        return datetimeEdit;
    }

    public static Builder newBuilder() {
        return new Record().new Builder();
    }

    @Override
    public String toString() {
        return "Запись{" +
                "фамилия = '" + firstName + '\'' +
                ", имя = '" + lastName + '\'' +
                ", дата рождения = " + doB +
                ", телефон(ы) = " + phoneList +
                ", адрес = '" + address + '\'' +
                ", дата и время редактирования = " + datetimeEdit +
                '}';
    }

    public class Builder {

        private Builder() {
            setDatetimeEdit();
        }

        public Builder setFirstName(String firstName) {
            Record.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            if (lastName == null) {
                throw new IllegalArgumentException("Значение не может быть \"null\"");
            }
            Record.this.lastName = lastName;
            return this;
        }

        public Builder setDob(int year, int month, int dayOfMonth) {
            Record.this.doB = LocalDate.of(year, month, dayOfMonth);
            return this;
        }

        public Builder setPhoneList(List<Phone> phoneList) {
            Record.this.phoneList = phoneList;
            return this;
        }

        public Builder setPhone(Phone phone) {
            phoneList.add(phone);
            return this;
        }

        public Builder setAddress(String address) {
            Record.this.address = address;
            return this;
        }

        private void setDatetimeEdit() {
            Record.this.datetimeEdit = LocalDate.now();
        }

        public Record build() {
            return  Record.this;
        }
    }
}