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

public val BrokenGroup.Vuesax: ImageVector
    get() {
        if (_vuesax != null) {
            return _vuesax!!
        }
        _vuesax = Builder(name = "Vuesax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0009f, 8.0f)
                lineTo(12.0009f, 22.0f)
                lineTo(2.9609f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.53f, 12.52f)
                lineTo(12.0f, 18.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(6.0f)
                lineTo(12.0f, 13.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineTo(21.0f)
                lineTo(18.01f, 8.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                lineTo(12.0f, 9.0f)
                lineTo(16.0f, 3.0f)
                lineTo(13.2f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.8f)
                verticalLineTo(4.0f)
                lineTo(8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _vuesax!!
    }

private var _vuesax: ImageVector? = null
