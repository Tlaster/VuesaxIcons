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

public val BrokenGroup.Ticket2: ImageVector
    get() {
        if (_ticket2 != null) {
            return _ticket2!!
        }
        _ticket2 = Builder(name = "Ticket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0291f, 14.97f)
                curveTo(19.0291f, 16.26f, 20.0891f, 17.31f, 21.3791f, 17.31f)
                curveTo(21.3791f, 21.06f, 20.4391f, 22.0f, 16.6891f, 22.0f)
                horizontalLineTo(7.3091f)
                curveTo(3.5591f, 22.0f, 2.6191f, 21.06f, 2.6191f, 17.31f)
                verticalLineTo(16.85f)
                curveTo(3.9091f, 16.85f, 4.9691f, 15.79f, 4.9691f, 14.5f)
                curveTo(4.9691f, 13.21f, 3.9091f, 12.15f, 2.6191f, 12.15f)
                verticalLineTo(11.69f)
                curveTo(2.6291f, 7.94f, 3.5591f, 7.0f, 7.3091f, 7.0f)
                horizontalLineTo(16.6791f)
                curveTo(20.4291f, 7.0f, 21.3691f, 7.94f, 21.3691f, 11.69f)
                verticalLineTo(12.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3302f, 7.0001f)
                horizontalLineTo(7.2402f)
                lineTo(10.1702f, 4.0701f)
                curveTo(12.5602f, 1.6801f, 13.7602f, 1.6801f, 16.1502f, 4.0701f)
                lineTo(16.7502f, 4.6701f)
                curveTo(16.1202f, 5.3001f, 15.9702f, 6.2301f, 16.3302f, 7.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineTo(10.0f, 22.0f)
            }
        }
        .build()
        return _ticket2!!
    }

private var _ticket2: ImageVector? = null
