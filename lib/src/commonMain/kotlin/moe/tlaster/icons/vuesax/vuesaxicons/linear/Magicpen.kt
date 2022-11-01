package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Magicpen: ImageVector
    get() {
        if (_magicpen != null) {
            return _magicpen!!
        }
        _magicpen = Builder(name = "Magicpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 20.4999f)
                curveTo(4.33f, 21.3299f, 5.67f, 21.3299f, 6.5f, 20.4999f)
                lineTo(19.5f, 7.4999f)
                curveTo(20.33f, 6.6699f, 20.33f, 5.3299f, 19.5f, 4.4999f)
                curveTo(18.67f, 3.6699f, 17.33f, 3.6699f, 16.5f, 4.4999f)
                lineTo(3.5f, 17.4999f)
                curveTo(2.67f, 18.3299f, 2.67f, 19.6699f, 3.5f, 20.4999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.01f, 8.99f)
                lineTo(15.01f, 5.99f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 2.44f)
                lineTo(10.0f, 2.0f)
                lineTo(9.56f, 3.5f)
                lineTo(10.0f, 5.0f)
                lineTo(8.5f, 4.56f)
                lineTo(7.0f, 5.0f)
                lineTo(7.44f, 3.5f)
                lineTo(7.0f, 2.0f)
                lineTo(8.5f, 2.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 8.44f)
                lineTo(6.0f, 8.0f)
                lineTo(5.56f, 9.5f)
                lineTo(6.0f, 11.0f)
                lineTo(4.5f, 10.56f)
                lineTo(3.0f, 11.0f)
                lineTo(3.44f, 9.5f)
                lineTo(3.0f, 8.0f)
                lineTo(4.5f, 8.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 13.44f)
                lineTo(21.0f, 13.0f)
                lineTo(20.56f, 14.5f)
                lineTo(21.0f, 16.0f)
                lineTo(19.5f, 15.56f)
                lineTo(18.0f, 16.0f)
                lineTo(18.44f, 14.5f)
                lineTo(18.0f, 13.0f)
                lineTo(19.5f, 13.44f)
                close()
            }
        }
        .build()
        return _magicpen!!
    }

private var _magicpen: ImageVector? = null
