package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Arrowleft3: ImageVector
    get() {
        if (_arrowleft3 != null) {
            return _arrowleft3!!
        }
        _arrowleft3 = Builder(name = "Arrowleft3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9783f, 5.3188f)
                lineTo(10.7683f, 8.5288f)
                lineTo(8.7983f, 10.4888f)
                curveTo(7.9683f, 11.3188f, 7.9683f, 12.6688f, 8.7983f, 13.4988f)
                lineTo(13.9783f, 18.6788f)
                curveTo(14.6583f, 19.3588f, 15.8183f, 18.8688f, 15.8183f, 17.9188f)
                verticalLineTo(12.3088f)
                verticalLineTo(6.0788f)
                curveTo(15.8183f, 5.1188f, 14.6583f, 4.6388f, 13.9783f, 5.3188f)
                close()
            }
        }
        .build()
        return _arrowleft3!!
    }

private var _arrowleft3: ImageVector? = null
