package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Notification: ImageVector
    get() {
        if (_notification != null) {
            return _notification!!
        }
        _notification = Builder(name = "Notification", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3399f, 14.4899f)
                lineTo(18.3399f, 12.8299f)
                curveTo(18.1299f, 12.4599f, 17.9399f, 11.7599f, 17.9399f, 11.3499f)
                verticalLineTo(8.8199f)
                curveTo(17.9399f, 5.5599f, 15.2899f, 2.8999f, 12.0199f, 2.8999f)
                curveTo(8.7499f, 2.8999f, 6.0999f, 5.5599f, 6.0999f, 8.8199f)
                verticalLineTo(11.3499f)
                curveTo(6.0999f, 11.7599f, 5.9099f, 12.4599f, 5.6999f, 12.8199f)
                lineTo(4.6899f, 14.4899f)
                curveTo(4.2899f, 15.1599f, 4.1999f, 15.8999f, 4.4499f, 16.5799f)
                curveTo(4.6899f, 17.2499f, 5.2599f, 17.7699f, 5.9999f, 18.0199f)
                curveTo(7.9399f, 18.6799f, 9.9799f, 18.9999f, 12.0199f, 18.9999f)
                curveTo(14.0599f, 18.9999f, 16.0999f, 18.6799f, 18.0399f, 18.0299f)
                curveTo(18.7399f, 17.7999f, 19.2799f, 17.2699f, 19.5399f, 16.5799f)
                curveTo(19.7999f, 15.8899f, 19.7299f, 15.1299f, 19.3399f, 14.4899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2508f, 3.32f)
                curveTo(13.5608f, 3.05f, 12.8108f, 2.9f, 12.0208f, 2.9f)
                curveTo(11.2408f, 2.9f, 10.4908f, 3.04f, 9.8008f, 3.32f)
                curveTo(10.2308f, 2.51f, 11.0808f, 2.0f, 12.0208f, 2.0f)
                curveTo(12.9708f, 2.0f, 13.8108f, 2.51f, 14.2508f, 3.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8297f, 20.01f)
                curveTo(14.4097f, 21.17f, 13.2997f, 22.0f, 11.9997f, 22.0f)
                curveTo(11.2097f, 22.0f, 10.4297f, 21.68f, 9.8797f, 21.11f)
                curveTo(9.5597f, 20.81f, 9.3197f, 20.41f, 9.1797f, 20.0f)
                curveTo(9.3097f, 20.02f, 9.4397f, 20.03f, 9.5797f, 20.05f)
                curveTo(9.8097f, 20.08f, 10.0497f, 20.11f, 10.2897f, 20.13f)
                curveTo(10.8597f, 20.18f, 11.4397f, 20.21f, 12.0197f, 20.21f)
                curveTo(12.5897f, 20.21f, 13.1597f, 20.18f, 13.7197f, 20.13f)
                curveTo(13.9297f, 20.11f, 14.1397f, 20.1f, 14.3397f, 20.07f)
                curveTo(14.4997f, 20.05f, 14.6597f, 20.03f, 14.8297f, 20.01f)
                close()
            }
        }
        .build()
        return _notification!!
    }

private var _notification: ImageVector? = null
