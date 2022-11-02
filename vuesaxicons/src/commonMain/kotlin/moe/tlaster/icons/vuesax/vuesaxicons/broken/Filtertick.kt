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

public val BrokenGroup.Filtertick: ImageVector
    get() {
        if (_filtertick != null) {
            return _filtertick!!
        }
        _filtertick = Builder(name = "Filtertick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6309f, 14.75f)
                curveTo(21.6309f, 15.64f, 21.3909f, 16.48f, 20.9509f, 17.2f)
                curveTo(20.1309f, 18.57f, 18.6209f, 19.5f, 16.8809f, 19.5f)
                curveTo(15.9409f, 19.5f, 15.0609f, 19.22f, 14.3209f, 18.73f)
                curveTo(13.7009f, 18.35f, 13.1909f, 17.82f, 12.8209f, 17.2f)
                curveTo(12.3809f, 16.48f, 12.1309f, 15.64f, 12.1309f, 14.75f)
                curveTo(12.1309f, 12.13f, 14.2609f, 10.0f, 16.8809f, 10.0f)
                curveTo(17.2409f, 10.0f, 17.5908f, 10.04f, 17.9208f, 10.12f)
                curveTo(20.0508f, 10.59f, 21.6309f, 12.49f, 21.6309f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0293f, 14.7501f)
                lineTo(16.1993f, 15.9201f)
                lineTo(18.7292f, 13.5801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.3306f, 2.0f)
                horizontalLineTo(18.6705f)
                curveTo(19.7805f, 2.0f, 20.6906f, 2.91f, 20.6906f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.6906f, 7.05f, 20.1805f, 8.06f, 19.6805f, 8.57f)
                lineTo(17.9205f, 10.12f)
                curveTo(17.5905f, 10.04f, 17.2406f, 10.0f, 16.8806f, 10.0f)
                curveTo(14.2606f, 10.0f, 12.1306f, 12.13f, 12.1306f, 14.75f)
                curveTo(12.1306f, 15.64f, 12.3806f, 16.48f, 12.8206f, 17.2f)
                curveTo(13.1906f, 17.82f, 13.7006f, 18.35f, 14.3206f, 18.73f)
                verticalLineTo(19.07f)
                curveTo(14.3206f, 19.68f, 13.9205f, 20.49f, 13.4105f, 20.79f)
                lineTo(12.0005f, 21.7f)
                curveTo(10.6905f, 22.51f, 8.8705f, 21.6f, 8.8705f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.8705f, 13.92f, 8.4606f, 13.01f, 8.0605f, 12.51f)
                lineTo(4.2205f, 8.47f)
                curveTo(3.7205f, 7.96f, 3.3105f, 7.05f, 3.3105f, 6.45f)
            }
        }
        .build()
        return _filtertick!!
    }

private var _filtertick: ImageVector? = null
