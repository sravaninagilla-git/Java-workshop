import java.util.PriorityQueue;

public class priorityqueuedemo {
    public static void main(String[] args) {
        /*PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(100);
        numbers.offer(20);
        numbers.offer(10);
        numbers.offer(50);
        while (!numbers.isEmpty()) {
            System.out.println("pollimg:" + numbers.poll());
        }
        PriorityQueue<Patient> emergencyRoom = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity));
        emergencyRoom.offer(new Patient("John", 3));
        emergencyRoom.offer(new Patient("Mike", 1));//minor
        emergencyRoom.offer(new Patient("Stephen", 5));//critical
        while (!emergencyRoom.isEmpty()) {
            System.out.println("Treating" + emergencyRoom.poll());

        }
    }
}
        class Patient{
            String name;
            int severity;
            public Patient(String name, int severity){
                this.name=name;
                this.severity=severity;
            }
        public String toString(){
            return "Patient[name=\"" + name + "\", severity=" + severity + "]";
           }
        }*/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(23);
        pq.add(89);
        pq.add(67);
        pq.add(34);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        

    }
}

