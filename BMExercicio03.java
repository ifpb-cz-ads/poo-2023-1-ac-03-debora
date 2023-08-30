ublic class BMExercio03 {
    public static void main(String[] args) {
        float kinderOvo = 3.50f;
        float bis = 2.95f;
        float taxa_$ = 8.25f;

        System.out.println("Valor do Kinder Ovo: " + kinderOvo + "\nValor do Bis: " + bis);

        float total = kinderOvo + bis;

        System.out.println("\nTotal sem taxa: " + total);

        float taxaCalculada = (total * (taxa_$ / 100));

        System.out.println("\nTaxa calculada: " + taxaCalculada);

        float novoCusto = total + taxaCalculada * 2;

        boolean muitoCaro = novoCusto > 10;

        System.out.println("\nVáriavel 'muitoCaro': " + muitoCaro);

    }
}
