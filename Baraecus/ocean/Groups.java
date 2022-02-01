package ocean;

public interface Groups {

    int MAX_PERCENTAGE = 25;
    double defGroupProbability = 0.24;

    public abstract double getProbabilityX(int quantity, int max_q); //probabilidad según el numero de animales que hay en el grupo

    public abstract double getProbabilityY(int quantity, int max_q); // probabilidad según el numero de animales que hay en el grupo
}
