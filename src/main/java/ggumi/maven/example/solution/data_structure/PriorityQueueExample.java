package ggumi.maven.example.solution.data_structure;

import ggumi.maven.example.solution.data_structure.Gillog;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Gillog> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Gillog(3650, "10년후 글"));
        priorityQueue.add(new Gillog(31, "한달 후 글"));
        priorityQueue.add(new Gillog(1, "첫번째 글"));
        priorityQueue.add(new Gillog(365, "1년후 글"));

        while (!priorityQueue.isEmpty()) {
            Gillog gilLog = priorityQueue.poll();
            System.out.println("글 넘버 : " + gilLog.getWriteRowNumber() + " 글 내용 : " + gilLog.getContent());
        }
    }
}
