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

public val LinearGroup.Ranking1: ImageVector
    get() {
        if (_ranking1 != null) {
            return _ranking1!!
        }
        _ranking1 = Builder(name = "Ranking1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3f, 8.11f)
                lineTo(14.62f, 10.75f)
                curveTo(14.8f, 11.11f, 15.28f, 11.47f, 15.68f, 11.53f)
                lineTo(18.07f, 11.93f)
                curveTo(19.6f, 12.19f, 19.96f, 13.29f, 18.86f, 14.39f)
                lineTo(17.0f, 16.25f)
                curveTo(16.69f, 16.56f, 16.51f, 17.17f, 16.61f, 17.61f)
                lineTo(17.14f, 19.92f)
                curveTo(17.56f, 21.74f, 16.59f, 22.45f, 14.98f, 21.5f)
                lineTo(12.74f, 20.17f)
                curveTo(12.33f, 19.93f, 11.67f, 19.93f, 11.26f, 20.17f)
                lineTo(9.02f, 21.5f)
                curveTo(7.41f, 22.45f, 6.4399f, 21.74f, 6.86f, 19.92f)
                lineTo(7.39f, 17.61f)
                curveTo(7.49f, 17.18f, 7.31f, 16.57f, 7.0f, 16.25f)
                lineTo(5.14f, 14.39f)
                curveTo(4.04f, 13.29f, 4.4f, 12.18f, 5.93f, 11.93f)
                lineTo(8.32f, 11.53f)
                curveTo(8.72f, 11.46f, 9.2f, 11.11f, 9.38f, 10.75f)
                lineTo(10.7f, 8.11f)
                curveTo(11.41f, 6.68f, 12.59f, 6.68f, 13.3f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(2.0f)
            }
        }
        .build()
        return _ranking1!!
    }

private var _ranking1: ImageVector? = null
