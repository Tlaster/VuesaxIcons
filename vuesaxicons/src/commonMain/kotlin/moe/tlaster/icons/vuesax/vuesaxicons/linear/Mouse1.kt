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

public val LinearGroup.Mouse1: ImageVector
    get() {
        if (_mouse1 != null) {
            return _mouse1!!
        }
        _mouse1 = Builder(name = "Mouse1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(16.13f, 22.0f, 19.5f, 18.63f, 19.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(19.5f, 5.37f, 16.13f, 2.0f, 12.0f, 2.0f)
                curveTo(7.87f, 2.0f, 4.5f, 5.37f, 4.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(4.5f, 18.63f, 7.87f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveTo(11.17f, 11.0f, 10.5f, 10.33f, 10.5f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(10.5f, 6.67f, 11.17f, 6.0f, 12.0f, 6.0f)
                curveTo(12.82f, 6.0f, 13.5f, 6.67f, 13.5f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(13.5f, 10.33f, 12.82f, 11.0f, 12.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(2.0f)
            }
        }
        .build()
        return _mouse1!!
    }

private var _mouse1: ImageVector? = null
