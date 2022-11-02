package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Shapes1: ImageVector
    get() {
        if (_shapes1 != null) {
            return _shapes1!!
        }
        _shapes1 = Builder(name = "Shapes1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8103f, 3.2399f)
                curveTo(7.7203f, 1.5899f, 10.1003f, 1.5899f, 11.0103f, 3.2399f)
                lineTo(13.2003f, 7.2099f)
                lineTo(14.2503f, 9.12f)
                lineTo(15.5303f, 11.45f)
                curveTo(16.4103f, 13.05f, 15.2503f, 15.0f, 13.4303f, 15.0f)
                horizontalLineTo(4.4003f)
                curveTo(2.5803f, 15.0f, 1.4203f, 13.05f, 2.3003f, 11.45f)
                lineTo(4.6303f, 7.2099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 19.09f, 19.09f, 22.0f, 15.5f, 22.0f)
                curveTo(11.91f, 22.0f, 9.0f, 19.09f, 9.0f, 15.5f)
                curveTo(9.0f, 15.33f, 9.01f, 15.17f, 9.02f, 15.0f)
                horizontalLineTo(13.43f)
                curveTo(15.25f, 15.0f, 16.41f, 13.05f, 15.53f, 11.45f)
                lineTo(14.25f, 9.12f)
                curveTo(14.65f, 9.04f, 15.07f, 9.0f, 15.5f, 9.0f)
                curveTo(19.09f, 9.0f, 22.0f, 11.91f, 22.0f, 15.5f)
                close()
            }
        }
        .build()
        return _shapes1!!
    }

private var _shapes1: ImageVector? = null
