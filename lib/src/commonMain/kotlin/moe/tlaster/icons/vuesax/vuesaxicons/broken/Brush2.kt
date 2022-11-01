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

public val BrokenGroup.Brush2: ImageVector
    get() {
        if (_brush2 != null) {
            return _brush2!!
        }
        _brush2 = Builder(name = "Brush2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 19.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.5f)
                curveTo(3.95f, 18.0f, 3.45f, 17.78f, 3.09f, 17.41f)
                curveTo(2.72f, 17.05f, 2.5f, 16.55f, 2.5f, 16.0f)
                curveTo(2.5f, 14.97f, 3.3f, 14.11f, 4.31f, 14.01f)
                curveTo(4.37f, 14.0f, 4.43f, 14.0f, 4.5f, 14.0f)
                horizontalLineTo(19.5f)
                curveTo(19.57f, 14.0f, 19.63f, 14.0f, 19.69f, 14.01f)
                curveTo(20.17f, 14.05f, 20.59f, 14.26f, 20.91f, 14.59f)
                curveTo(21.32f, 14.99f, 21.54f, 15.56f, 21.49f, 16.18f)
                curveTo(21.4f, 17.23f, 20.45f, 18.0f, 19.39f, 18.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 20.88f, 13.38f, 22.0f, 12.0f, 22.0f)
                curveTo(10.62f, 22.0f, 9.5f, 20.88f, 9.5f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8002f, 12.0f)
                lineTo(19.6902f, 14.01f)
                curveTo(19.6302f, 14.0f, 19.5702f, 14.0f, 19.5002f, 14.0f)
                horizontalLineTo(4.5002f)
                curveTo(4.4302f, 14.0f, 4.3702f, 14.0f, 4.3102f, 14.01f)
                lineTo(3.8302f, 5.3f)
                curveTo(3.6502f, 3.53f, 5.0402f, 2.0f, 6.8102f, 2.0f)
                horizontalLineTo(17.1902f)
                curveTo(18.9602f, 2.0f, 20.3502f, 3.53f, 20.1702f, 5.3f)
                lineTo(20.0202f, 8.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9902f, 2.0f)
                verticalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.0f)
            }
        }
        .build()
        return _brush2!!
    }

private var _brush2: ImageVector? = null
