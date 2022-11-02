package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Programmingarrow: ImageVector
    get() {
        if (_programmingarrow != null) {
            return _programmingarrow!!
        }
        _programmingarrow = Builder(name = "Programmingarrow", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.75f, 16.1098f)
                verticalLineTo(7.8998f)
                curveTo(7.04f, 7.5698f, 8.0f, 6.3998f, 8.0f, 5.0098f)
                curveTo(8.0f, 3.3498f, 6.66f, 2.0098f, 5.0f, 2.0098f)
                curveTo(3.34f, 2.0098f, 2.0f, 3.3498f, 2.0f, 5.0098f)
                curveTo(2.0f, 6.4098f, 2.96f, 7.5698f, 4.25f, 7.8998f)
                verticalLineTo(16.1098f)
                curveTo(2.96f, 16.4398f, 2.0f, 17.6098f, 2.0f, 18.9998f)
                curveTo(2.0f, 20.6598f, 3.34f, 21.9998f, 5.0f, 21.9998f)
                curveTo(6.66f, 21.9998f, 8.0f, 20.6598f, 8.0f, 18.9998f)
                curveTo(8.0f, 17.5998f, 7.04f, 16.4398f, 5.75f, 16.1098f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 16.1102f)
                verticalLineTo(6.5002f)
                curveTo(19.75f, 4.9802f, 18.52f, 3.7502f, 17.0f, 3.7502f)
                horizontalLineTo(14.07f)
                lineTo(15.48f, 2.5802f)
                curveTo(15.8f, 2.3102f, 15.84f, 1.8402f, 15.58f, 1.5202f)
                curveTo(15.31f, 1.2002f, 14.84f, 1.1602f, 14.52f, 1.4202f)
                lineTo(11.52f, 3.9202f)
                curveTo(11.35f, 4.0602f, 11.25f, 4.2702f, 11.25f, 4.5002f)
                curveTo(11.25f, 4.7302f, 11.35f, 4.9302f, 11.52f, 5.0802f)
                lineTo(14.52f, 7.5802f)
                curveTo(14.66f, 7.7002f, 14.83f, 7.7502f, 15.0f, 7.7502f)
                curveTo(15.21f, 7.7502f, 15.43f, 7.6602f, 15.58f, 7.4802f)
                curveTo(15.85f, 7.1602f, 15.8f, 6.6902f, 15.48f, 6.4202f)
                lineTo(14.07f, 5.2502f)
                horizontalLineTo(17.0f)
                curveTo(17.69f, 5.2502f, 18.25f, 5.8102f, 18.25f, 6.5002f)
                verticalLineTo(16.1102f)
                curveTo(16.96f, 16.4402f, 16.0f, 17.6102f, 16.0f, 19.0002f)
                curveTo(16.0f, 20.6602f, 17.34f, 22.0002f, 19.0f, 22.0002f)
                curveTo(20.66f, 22.0002f, 22.0f, 20.6602f, 22.0f, 19.0002f)
                curveTo(22.0f, 17.6002f, 21.04f, 16.4402f, 19.75f, 16.1102f)
                close()
            }
        }
        .build()
        return _programmingarrow!!
    }

private var _programmingarrow: ImageVector? = null
