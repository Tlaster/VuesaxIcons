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

public val BrokenGroup.Rotateleft1: ImageVector
    get() {
        if (_rotateleft1 != null) {
            return _rotateleft1!!
        }
        _rotateleft1 = Builder(name = "Rotateleft1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.75f)
                curveTo(2.0f, 20.5f, 3.5f, 22.0f, 7.25f, 22.0f)
                horizontalLineTo(11.75f)
                curveTo(15.5f, 22.0f, 17.0f, 20.5f, 17.0f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(17.0f, 8.5f, 15.5f, 7.0f, 11.75f, 7.0f)
                horizontalLineTo(7.25f)
                curveTo(3.5f, 7.0f, 2.0f, 8.5f, 2.0f, 12.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                lineTo(16.05f, 3.75f)
            }
        }
        .build()
        return _rotateleft1!!
    }

private var _rotateleft1: ImageVector? = null
