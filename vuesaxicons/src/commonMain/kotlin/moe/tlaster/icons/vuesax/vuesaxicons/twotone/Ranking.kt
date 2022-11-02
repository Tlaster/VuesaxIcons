package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3f, 8.1101f)
                lineTo(14.62f, 10.7501f)
                curveTo(14.8f, 11.1101f, 15.28f, 11.4701f, 15.68f, 11.5301f)
                lineTo(18.07f, 11.9301f)
                curveTo(19.6f, 12.1901f, 19.96f, 13.2901f, 18.86f, 14.3901f)
                lineTo(17.0f, 16.2501f)
                curveTo(16.69f, 16.5601f, 16.51f, 17.1701f, 16.61f, 17.6101f)
                lineTo(17.14f, 19.9201f)
                curveTo(17.56f, 21.7401f, 16.59f, 22.4501f, 14.98f, 21.5001f)
                lineTo(12.74f, 20.1701f)
                curveTo(12.33f, 19.9301f, 11.67f, 19.9301f, 11.26f, 20.1701f)
                lineTo(9.02f, 21.5001f)
                curveTo(7.41f, 22.4501f, 6.4399f, 21.7401f, 6.86f, 19.9201f)
                lineTo(7.39f, 17.6101f)
                curveTo(7.49f, 17.1801f, 7.31f, 16.5701f, 7.0f, 16.2501f)
                lineTo(5.14f, 14.3901f)
                curveTo(4.04f, 13.2901f, 4.4f, 12.1801f, 5.93f, 11.9301f)
                lineTo(8.32f, 11.5301f)
                curveTo(8.72f, 11.4601f, 9.2f, 11.1101f, 9.38f, 10.7501f)
                lineTo(10.7f, 8.1101f)
                curveTo(11.41f, 6.6801f, 12.59f, 6.6801f, 13.3f, 8.1101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(2.0f)
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null
