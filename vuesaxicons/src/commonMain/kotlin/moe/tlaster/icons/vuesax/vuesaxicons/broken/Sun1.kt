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

public val BrokenGroup.Sun1: ImageVector
    get() {
        if (_sun1 != null) {
            return _sun1!!
        }
        _sun1 = Builder(name = "Sun1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 7.85f)
                curveTo(6.06f, 8.98f, 5.5f, 10.42f, 5.5f, 12.0f)
                curveTo(5.5f, 15.59f, 8.41f, 18.5f, 12.0f, 18.5f)
                curveTo(15.59f, 18.5f, 18.5f, 15.59f, 18.5f, 12.0f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.14f, 19.14f)
                lineTo(19.01f, 19.01f)
                moveTo(19.01f, 4.99f)
                lineTo(19.14f, 4.86f)
                lineTo(19.01f, 4.99f)
                close()
                moveTo(4.86f, 19.14f)
                lineTo(4.99f, 19.01f)
                lineTo(4.86f, 19.14f)
                close()
                moveTo(12.0f, 2.08f)
                verticalLineTo(2.0f)
                verticalLineTo(2.08f)
                close()
                moveTo(12.0f, 22.0f)
                verticalLineTo(21.92f)
                verticalLineTo(22.0f)
                close()
                moveTo(2.08f, 12.0f)
                horizontalLineTo(2.0f)
                horizontalLineTo(2.08f)
                close()
                moveTo(22.0f, 12.0f)
                horizontalLineTo(21.92f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.99f, 4.99f)
                lineTo(4.86f, 4.86f)
                lineTo(4.99f, 4.99f)
                close()
            }
        }
        .build()
        return _sun1!!
    }

private var _sun1: ImageVector? = null
