package com.vihangpatil.java9app.main;

import com.vihangpatil.java9app.impl.Circle;
import com.vihangpatil.java9app.impl.Square;
import com.vihangpatil.java9app.impl.EmailPublisher;

/**
 * @author Vihang Patil <vihang.patil@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        EmailPublisher publisher = new EmailPublisher(args[1], args[2], args[3], 25);
        Circle c = new Circle(3);
        Square s = new Square(4);
        String emailMessage = String.format("Circle area is %s, and square area is %s", String.valueOf(c.getArea()), String.valueOf(s.getArea()));
        Boolean sent = publisher.sendMail(args[0], "vihang.patil@gmail.com", "Results of area calculation", emailMessage);
        System.out.println("Java9App: sent mail "+sent);
        System.exit((sent == true) ? 0 : 1);
    }
}
