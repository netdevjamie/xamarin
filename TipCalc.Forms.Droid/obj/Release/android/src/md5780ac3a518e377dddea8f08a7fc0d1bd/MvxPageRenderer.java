package md5780ac3a518e377dddea8f08a7fc0d1bd;


public class MvxPageRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.PageRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Forms.Platforms.Android.Views.MvxPageRenderer, MvvmCross.Forms", MvxPageRenderer.class, __md_methods);
	}


	public MvxPageRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxPageRenderer.class)
			mono.android.TypeManager.Activate ("MvvmCross.Forms.Platforms.Android.Views.MvxPageRenderer, MvvmCross.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxPageRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxPageRenderer.class)
			mono.android.TypeManager.Activate ("MvvmCross.Forms.Platforms.Android.Views.MvxPageRenderer, MvvmCross.Forms", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxPageRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxPageRenderer.class)
			mono.android.TypeManager.Activate ("MvvmCross.Forms.Platforms.Android.Views.MvxPageRenderer, MvvmCross.Forms", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
