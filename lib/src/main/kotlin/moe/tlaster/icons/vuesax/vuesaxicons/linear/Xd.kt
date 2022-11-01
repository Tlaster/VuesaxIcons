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

public val LinearGroup.Xd: ImageVector
    get() {
        if (_xd != null) {
            return _xd!!
        }
        _xd = Builder(name = "Xd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9999f, 8.5f)
                verticalLineTo(15.6f)
                horizontalLineTo(16.1999f)
                curveTo(15.1999f, 15.6f, 14.3999f, 14.8f, 14.3999f, 13.8f)
                curveTo(14.3999f, 12.8f, 15.1999f, 12.0f, 16.1999f, 12.0f)
                horizontalLineTo(17.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.5f)
                lineTo(11.7f, 15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.7f, 8.5f)
                lineTo(6.0f, 15.5f)
            }
        }
        .build()
        return _xd!!
    }

private var _xd: ImageVector? = null
