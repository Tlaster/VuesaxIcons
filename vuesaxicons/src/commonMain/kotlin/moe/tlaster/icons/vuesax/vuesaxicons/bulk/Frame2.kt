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

public val BulkGroup.Frame2: ImageVector
    get() {
        if (_frame2 != null) {
            return _frame2!!
        }
        _frame2 = Builder(name = "Frame2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.25f, 9.1499f)
                curveTo(18.94f, 5.5199f, 15.56f, 3.4299f, 12.0f, 3.4299f)
                curveTo(10.22f, 3.4299f, 8.49f, 3.9499f, 6.91f, 4.9199f)
                curveTo(5.33f, 5.8999f, 3.91f, 7.3299f, 2.75f, 9.1499f)
                curveTo(1.75f, 10.7199f, 1.75f, 13.2699f, 2.75f, 14.8399f)
                curveTo(5.06f, 18.4799f, 8.44f, 20.5599f, 12.0f, 20.5599f)
                curveTo(13.78f, 20.5599f, 15.51f, 20.0399f, 17.09f, 19.0699f)
                curveTo(18.67f, 18.0899f, 20.09f, 16.6599f, 21.25f, 14.8399f)
                curveTo(22.25f, 13.2799f, 22.25f, 10.7199f, 21.25f, 9.1499f)
                close()
                moveTo(12.0f, 16.0399f)
                curveTo(9.76f, 16.0399f, 7.96f, 14.2299f, 7.96f, 11.9999f)
                curveTo(7.96f, 9.7699f, 9.76f, 7.9599f, 12.0f, 7.9599f)
                curveTo(14.24f, 7.9599f, 16.04f, 9.7699f, 16.04f, 11.9999f)
                curveTo(16.04f, 14.2299f, 14.24f, 16.0399f, 12.0f, 16.0399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 9.1399f)
                curveTo(10.4304f, 9.1399f, 9.1504f, 10.4199f, 9.1504f, 11.9999f)
                curveTo(9.1504f, 13.5699f, 10.4304f, 14.8499f, 12.0004f, 14.8499f)
                curveTo(13.5704f, 14.8499f, 14.8604f, 13.5699f, 14.8604f, 11.9999f)
                curveTo(14.8604f, 10.4299f, 13.5704f, 9.1399f, 12.0004f, 9.1399f)
                close()
            }
        }
        .build()
        return _frame2!!
    }

private var _frame2: ImageVector? = null
