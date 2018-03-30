package control;

public interface Accionable {
	/**
	 * Realiza la jugada. Implementa m�todos de Jugable.
	 * 
	 * @param x
	 *            coordenada x.
	 * @param y
	 *            coordenada y.
	 */
	public void realizarJugada(int posX, int posY, int id);

	public void borrarMemoria();

}
