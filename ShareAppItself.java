
Share your app apk file in my app

public static void sendAppItself(Activity paramActivity) throws IOException {
PackageManager pm = paramActivity.getPackageManager();
ApplicationInfo appInfo;
try {
appInfo = pm.getApplicationInfo(paramActivity.getPackageName(),
PackageManager.GET_META_DATA);
Intent sendBt = new Intent(Intent.ACTION_SEND);
sendBt.setType(“*/*”);
sendBt.putExtra(Intent.EXTRA_STREAM,
Uri.parse(“file://” + appInfo.publicSourceDir));

paramActivity.startActivity(Intent.createChooser(sendBt,
“Share it using”));
} catch (PackageManager.NameNotFoundException e1) {
e1.printStackTrace();
}
}
