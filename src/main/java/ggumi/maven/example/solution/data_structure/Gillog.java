package ggumi.maven.example.solution.data_structure;

import lombok.Getter;

@Getter
class Gillog implements Comparable<Gillog> {

    private int writeRowNumber;
    private String content;

    public Gillog(int writeRowNumber, String content) {
        this.writeRowNumber = writeRowNumber;
        this.content = content;
    }

    @Override
    public int compareTo(Gillog gillog) {

        if (this.writeRowNumber > gillog.getWriteRowNumber())
            return 1;
        else if (this.writeRowNumber < gillog.getWriteRowNumber())
            return -1;
        return 0;
    }
}