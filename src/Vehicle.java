
public class Vehicle extends CarApp {

        private String car;
        private String Color;
        private String Acceleration;
        private String Starting;
        private String Speed;
        private String Stop;
        private String Name;



    public String getName(){
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getAcceleration() {
            return Acceleration;
        }

        public void setAcceleration(String acceleration) {
            Acceleration = acceleration;
        }

        public String getStarting() {
            return Starting;
        }

        public void setStarting(String starting) {
            Starting = starting;
        }

        public String getSpeed() {
            return Speed;
        }

        public void setSpeed(String speed) {
            Speed = speed;
        }

        public String getStop() {
            return Stop;
        }

        public void setStop(String stop) {
            Stop = stop;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String blue) {
            Color = blue;
        }
        public void Accelerate()
        {
            System.out.println("Car Accelerating");
        }



        public String vecdetails() {
            String vecinfo;
            vecinfo = getName()+"\n";
            vecinfo += getColor()+"\n";
            vecinfo += getAcceleration()+"\n ";
            vecinfo += getStarting()+" \n ";
            vecinfo += getSpeed()+"\n ";
            vecinfo += getStop()+"\n ";
            return vecinfo;
        }



}
