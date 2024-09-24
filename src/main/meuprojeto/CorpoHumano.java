package meuprojeto;
public class CorpoHumano {
    private float massa; // Se esta linha fosse substituida por "public float massa;" ocorreria uma modificação de acesso tornando a variável acessivel sem a necessidade de get/set
    private float volume;
    private float densidade;
    private float altura;

    // region get/set massa
    public float getMassa() {
        return massa;
    }
    public float setMassa(float massa) {
        return this.massa = massa;
    }
    // endregion

    // region get/set volume
    public float getVolume() { // Se esta linha fosse substituida por "private setVolume(float volume)" o acesso ao método seria mais restrito permitindo acesso apenas dentro da classe CorpoHumano
        return volume;
    }
    public float setVolume(float volume) {
        return this.volume = volume;
    }
    // endregion

    // region get/set densidade
    public float getDensidade() {
        return densidade;
    }
    public float setDensidade(float densidade) {
        return this.densidade = densidade;
    }
    // endregion

    // region get/set altura
    public float getAltura() {
        return altura;
    }

    public float setAltura(float altura) {
        return this.altura = altura;
    }
    // endregion

    // region Construtor
    public CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }
    // endregion
}
