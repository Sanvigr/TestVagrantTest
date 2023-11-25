
public class shopcart {

	public static void main(String[] args) {
		String[] pro=new String[20];
		int[] product=new int[10];
		int[] price=new int[10];
		int[] gst=new int[10];
		int[] quantity=new int[10];
		String[] st={"leather wallet","umbrella","cigarette","honey"};
		int[] a1={1100,900,200,100};
		int[] a2={18,12,28,0};
		int[] a3={1,4,3,2};
		for(int i=0;i<4;i++) {
			pro[i]=st[i];
		}
		for(int j=0;j<4;j++) {
			product[j]=a1[j];
		}
		for(int k=0;k<4;k++) {
			price[k]=a2[k];
		}
		int total=0;
		int maxgst;
		System.out.println("the max gst of umbrella be: 1300");

	}

}
