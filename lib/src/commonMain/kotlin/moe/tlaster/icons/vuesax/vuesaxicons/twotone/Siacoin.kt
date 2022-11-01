package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Siacoin: ImageVector
    get() {
        if (_siacoin != null) {
            return _siacoin!!
        }
        _siacoin = Builder(name = "Siacoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.97f, 2.84f)
                curveTo(9.2f, 2.3f, 10.56f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 10.59f, 2.29f, 9.24f, 2.82f, 8.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.25f)
                verticalLineTo(12.0f)
                curveTo(16.0f, 9.65f, 14.1f, 7.75f, 11.75f, 7.75f)
                curveTo(9.4f, 7.75f, 7.5f, 9.65f, 7.5f, 12.0f)
                curveTo(7.5f, 14.35f, 9.4f, 16.25f, 11.75f, 16.25f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.5f)
                curveTo(5.8284f, 6.5f, 6.5f, 5.8284f, 6.5f, 5.0f)
                curveTo(6.5f, 4.1716f, 5.8284f, 3.5f, 5.0f, 3.5f)
                curveTo(4.1716f, 3.5f, 3.5f, 4.1716f, 3.5f, 5.0f)
                curveTo(3.5f, 5.8284f, 4.1716f, 6.5f, 5.0f, 6.5f)
                close()
            }
        }
        .build()
        return _siacoin!!
    }

private var _siacoin: ImageVector? = null
