package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2702f, 9.1f)
                lineTo(14.3002f, 8.25f)
                curveTo(14.1402f, 8.18f, 14.0002f, 7.97f, 14.0002f, 7.79f)
                verticalLineTo(4.79f)
                curveTo(14.0002f, 3.85f, 13.3102f, 2.74f, 12.4702f, 2.31f)
                curveTo(12.1702f, 2.16f, 11.8202f, 2.16f, 11.5202f, 2.31f)
                curveTo(10.6802f, 2.74f, 9.9902f, 3.86f, 9.9902f, 4.8f)
                verticalLineTo(7.8f)
                curveTo(9.9902f, 7.98f, 9.8502f, 8.19f, 9.6902f, 8.26f)
                lineTo(4.1102f, 10.67f)
                curveTo(3.4902f, 10.92f, 2.9902f, 11.69f, 2.9902f, 12.36f)
                verticalLineTo(13.65f)
                curveTo(2.9902f, 14.49f, 3.6202f, 14.9f, 4.3902f, 14.57f)
                lineTo(9.3002f, 12.45f)
                curveTo(9.6802f, 12.28f, 10.0002f, 12.49f, 10.0002f, 12.91f)
                verticalLineTo(15.76f)
                curveTo(10.0002f, 15.99f, 9.8702f, 16.31f, 9.7102f, 16.47f)
                lineTo(7.4402f, 18.75f)
                curveTo(7.2002f, 18.99f, 7.0902f, 19.45f, 7.2002f, 19.78f)
                lineTo(7.6402f, 21.11f)
                curveTo(7.8202f, 21.69f, 8.4802f, 21.97f, 9.0202f, 21.69f)
                lineTo(11.3502f, 19.73f)
                curveTo(11.7002f, 19.43f, 12.2802f, 19.43f, 12.6302f, 19.73f)
                lineTo(14.9602f, 21.69f)
                curveTo(15.5002f, 21.96f, 16.1602f, 21.69f, 16.3602f, 21.11f)
                lineTo(16.8002f, 19.78f)
                curveTo(16.9102f, 19.46f, 16.8002f, 18.99f, 16.5602f, 18.75f)
                lineTo(14.2902f, 16.47f)
                curveTo(14.1202f, 16.31f, 13.9902f, 15.99f, 13.9902f, 15.76f)
                verticalLineTo(12.91f)
                curveTo(13.9902f, 12.49f, 14.3002f, 12.29f, 14.6902f, 12.45f)
                lineTo(19.6002f, 14.57f)
                curveTo(20.3702f, 14.9f, 21.0002f, 14.49f, 21.0002f, 13.65f)
                verticalLineTo(12.36f)
                curveTo(21.0002f, 11.69f, 20.5002f, 10.92f, 19.8802f, 10.66f)
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
