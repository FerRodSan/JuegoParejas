package control;

public interface Accionable {
	/**
	 * Realiza la jugada. Implementa m�todos de Jugable.
	 * 
	 * @param x
	 *            coordenada x.
	 * @param y
	 *            coordenada y.
	 * @throws InterruptedException
	 */
	public void realizarJugada(String[] coordenadas);

	public void borrarMemorias();

}
