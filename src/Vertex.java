public class Vertex { // Класс для станции
    public char label;         // Название
    public boolean isInTree;   // Переменная указывающая на изученность станции
    //TODO подумать о том как соблюсти инкапсуляцию в данном классе
    /**
     * Конструктор
     * @param lab  название
     */
    public Vertex(char lab)
    {
        label = lab;
        isInTree = false;     // По уиолчанию город не находится в графе
    }
}
