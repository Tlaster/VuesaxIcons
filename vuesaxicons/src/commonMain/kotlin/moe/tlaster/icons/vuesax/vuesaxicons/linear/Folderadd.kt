package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Folderadd: ImageVector
    get() {
        if (_folderadd != null) {
            return _folderadd!!
        }
        _folderadd = Builder(name = "Folderadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0601f, 16.5f)
                verticalLineTo(11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                horizontalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(10.0f, 2.0f, 10.33f, 2.44f, 10.9f, 3.2f)
                lineTo(12.4f, 5.2f)
                curveTo(12.78f, 5.7f, 13.0f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 6.0f, 22.0f, 7.0f, 22.0f, 11.0f)
                close()
            }
        }
        .build()
        return _folderadd!!
    }

private var _folderadd: ImageVector? = null
