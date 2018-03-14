.class public Lcom/android/tools/ir/server/AppInfo;
.super Ljava/lang/Object;


# static fields
.field public static applicationId:Ljava/lang/String;

.field public static token:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-string/jumbo v0, "com.kernel.banana.banglasignlanguage"

    sput-object v0, Lcom/android/tools/ir/server/AppInfo;->applicationId:Ljava/lang/String;

    const-wide v0, -0x6b893712e6323f86L    # -4.33161201487633E-210

    sput-wide v0, Lcom/android/tools/ir/server/AppInfo;->token:J

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
