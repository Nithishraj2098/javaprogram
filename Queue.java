public class Queue{
	public  static void main(String[] agrs){
		Queue1 q=new Queue1();
		q.Enqueue(1);
		q.Enqueue(5);
		q.Enqueue(8);
		q.Enqueue(9);
		q.Enqueue(1);

System.out.println(q.arr);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());



	}
}