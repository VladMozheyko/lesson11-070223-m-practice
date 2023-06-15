public class DistPar {  // Класс для определения расстояния между родителем и потомком
    public int distance;   // Расстояние от точки старта(A) до текущей точки
    public int parentVert; // Расстояние от текущего родителя точки

    /**
     * Конструктор
     * @param pv растояние от родителя
     * @param d переменная для расстояния от старта
     */
    public DistPar(int pv, int d)
    {
        distance = d;
        parentVert = pv;
    }
}
