
class RunnableClass implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//recoger nombre de hilo con .getName()
			System.out.println("Ejecutando " + Thread.currentThread().getName() + ":" + i);
		}
	}
}
