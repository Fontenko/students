package xyz.myfur.students.util;

public enum Day {
    SUNDAY(1){public String getName() {
        return "SUNDAY";
    }
    },
    MONDAY(2){
        public String getName() {
            return "MONDAY";
        }
    },
    TUESDAY(3){public String getName() {
        return "TUESDAY";
    }
    },
    WEDNESDAY(4){
        public String getName() {
            return "WEDNESDAY";
        }
    },
    THURSDAY(5){public String getName() {
        return "THURSDAY";
    }
    },
    FRIDAY(6){public String getName() {
        return "FRIDAY";
    }
    },
    SATURDAY(7){public String getName() {
        return "SATURDAY";
    }
    };

    private int dayId;

    Day(int dayId){
        this.dayId=dayId;
    }
    public abstract String getName();

    public int getId() {
        return dayId;
    }
}

