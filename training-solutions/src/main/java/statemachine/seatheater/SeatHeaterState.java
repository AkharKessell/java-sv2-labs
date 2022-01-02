package statemachine.seatheater;

public enum SeatHeaterState {
    THREE {
        public SeatHeaterState changeSetting() {
            return SeatHeaterState.TWO;
        }
    },
    TWO {
        public SeatHeaterState changeSetting() {
            return SeatHeaterState.ONE;
        }
    },
    ONE {
        public SeatHeaterState changeSetting() {
            return SeatHeaterState.OFF;
        }
    },
    OFF {
        public SeatHeaterState changeSetting() {
            return SeatHeaterState.THREE;
        }
    };

    abstract SeatHeaterState changeSetting();
}