package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0302f, 21.6898f)
                lineTo(11.3602f, 19.7298f)
                curveTo(11.7102f, 19.4298f, 12.2902f, 19.4298f, 12.6402f, 19.7298f)
                lineTo(14.9702f, 21.6898f)
                curveTo(15.5102f, 21.9598f, 16.1702f, 21.6898f, 16.3702f, 21.1098f)
                lineTo(16.8102f, 19.7798f)
                curveTo(16.9202f, 19.4598f, 16.8102f, 18.9898f, 16.5702f, 18.7498f)
                lineTo(14.3002f, 16.4698f)
                curveTo(14.1302f, 16.3098f, 14.0002f, 15.9898f, 14.0002f, 15.7598f)
                verticalLineTo(12.9098f)
                curveTo(14.0002f, 12.4898f, 14.3102f, 12.2898f, 14.7002f, 12.4498f)
                lineTo(19.6102f, 14.5698f)
                curveTo(20.3802f, 14.8998f, 21.0102f, 14.4898f, 21.0102f, 13.6498f)
                verticalLineTo(12.3598f)
                curveTo(21.0102f, 11.6898f, 20.5102f, 10.9198f, 19.8902f, 10.6598f)
                lineTo(14.3002f, 8.2498f)
                curveTo(14.1402f, 8.1798f, 14.0002f, 7.9698f, 14.0002f, 7.7898f)
                verticalLineTo(4.7898f)
                curveTo(14.0002f, 3.8498f, 13.3102f, 2.7398f, 12.4702f, 2.3098f)
                curveTo(12.1702f, 2.1598f, 11.8202f, 2.1598f, 11.5202f, 2.3098f)
                curveTo(10.6802f, 2.7398f, 9.9902f, 3.8598f, 9.9902f, 4.7998f)
                verticalLineTo(7.7998f)
                curveTo(9.9902f, 7.9798f, 9.8502f, 8.1898f, 9.6902f, 8.2598f)
                lineTo(4.1102f, 10.6698f)
                curveTo(3.4902f, 10.9198f, 2.9902f, 11.6898f, 2.9902f, 12.3598f)
                verticalLineTo(13.6498f)
                curveTo(2.9902f, 14.4898f, 3.6202f, 14.8998f, 4.3902f, 14.5698f)
                lineTo(9.3002f, 12.4498f)
                curveTo(9.6802f, 12.2798f, 10.0002f, 12.4898f, 10.0002f, 12.9098f)
                verticalLineTo(15.7598f)
                curveTo(10.0002f, 15.9898f, 9.8702f, 16.3098f, 9.7102f, 16.4698f)
                lineTo(7.4402f, 18.7498f)
                curveTo(7.2002f, 18.9898f, 7.0902f, 19.4498f, 7.2002f, 19.7798f)
                lineTo(7.6402f, 21.1098f)
                curveTo(7.8202f, 21.6898f, 8.4802f, 21.9698f, 9.0302f, 21.6898f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
