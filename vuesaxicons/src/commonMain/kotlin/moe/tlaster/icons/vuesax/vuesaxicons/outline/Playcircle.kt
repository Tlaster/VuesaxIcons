package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Playcircle: ImageVector
    get() {
        if (_playcircle != null) {
            return _playcircle!!
        }
        _playcircle = Builder(name = "Playcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 22.75f)
                curveTo(6.0507f, 22.75f, 1.2207f, 17.93f, 1.2207f, 12.0f)
                curveTo(1.2207f, 6.07f, 6.0507f, 1.25f, 11.9707f, 1.25f)
                curveTo(17.8907f, 1.25f, 22.7207f, 6.07f, 22.7207f, 12.0f)
                curveTo(22.7207f, 17.93f, 17.9007f, 22.75f, 11.9707f, 22.75f)
                close()
                moveTo(11.9707f, 2.75f)
                curveTo(6.8707f, 2.75f, 2.7207f, 6.9f, 2.7207f, 12.0f)
                curveTo(2.7207f, 17.1f, 6.8707f, 21.25f, 11.9707f, 21.25f)
                curveTo(17.0707f, 21.25f, 21.2207f, 17.1f, 21.2207f, 12.0f)
                curveTo(21.2207f, 6.9f, 17.0707f, 2.75f, 11.9707f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5602f, 16.99f)
                curveTo(10.1202f, 16.99f, 9.7002f, 16.88f, 9.3302f, 16.67f)
                curveTo(8.4702f, 16.17f, 7.9902f, 15.19f, 7.9902f, 13.91f)
                verticalLineTo(10.56f)
                curveTo(7.9902f, 9.28f, 8.4602f, 8.3f, 9.3202f, 7.8f)
                curveTo(10.1802f, 7.3f, 11.2702f, 7.38f, 12.3802f, 8.02f)
                lineTo(15.2802f, 9.69f)
                curveTo(16.3902f, 10.33f, 17.0002f, 11.23f, 17.0002f, 12.23f)
                curveTo(17.0002f, 13.22f, 16.3902f, 14.13f, 15.2802f, 14.77f)
                lineTo(12.3802f, 16.44f)
                curveTo(11.7602f, 16.81f, 11.1302f, 16.99f, 10.5602f, 16.99f)
                close()
                moveTo(10.5602f, 8.97f)
                curveTo(10.3802f, 8.97f, 10.2102f, 9.01f, 10.0802f, 9.09f)
                curveTo(9.7002f, 9.31f, 9.4902f, 9.84f, 9.4902f, 10.56f)
                verticalLineTo(13.91f)
                curveTo(9.4902f, 14.62f, 9.7002f, 15.16f, 10.0802f, 15.37f)
                curveTo(10.4502f, 15.59f, 11.0202f, 15.5f, 11.6402f, 15.15f)
                lineTo(14.5402f, 13.48f)
                curveTo(15.1602f, 13.12f, 15.5102f, 12.67f, 15.5102f, 12.24f)
                curveTo(15.5102f, 11.81f, 15.1502f, 11.36f, 14.5402f, 11.0f)
                lineTo(11.6402f, 9.33f)
                curveTo(11.2402f, 9.09f, 10.8702f, 8.97f, 10.5602f, 8.97f)
                close()
            }
        }
        .build()
        return _playcircle!!
    }

private var _playcircle: ImageVector? = null
