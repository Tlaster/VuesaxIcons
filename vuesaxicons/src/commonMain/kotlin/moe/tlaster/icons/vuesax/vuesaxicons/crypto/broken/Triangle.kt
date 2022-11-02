package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9004f, 2.0f)
                lineTo(0.9004f, 12.0f)
                lineTo(10.9004f, 22.0f)
                verticalLineTo(18.0f)
                lineTo(4.9004f, 12.0f)
                lineTo(10.9004f, 6.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9604f, 8.06f)
                lineTo(22.9004f, 12.0f)
                lineTo(12.9004f, 22.0f)
                verticalLineTo(18.0f)
                lineTo(18.9004f, 12.0f)
                lineTo(12.9004f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(15.9404f, 5.04f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9004f, 9.0f)
                lineTo(7.9004f, 12.0f)
                lineTo(10.9004f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
