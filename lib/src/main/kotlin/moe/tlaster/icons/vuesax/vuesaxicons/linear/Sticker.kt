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

public val LinearGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.93f, 12.86f)
                curveTo(21.91f, 13.05f, 21.88f, 13.23f, 21.83f, 13.41f)
                curveTo(20.79f, 12.53f, 19.44f, 12.0f, 17.97f, 12.0f)
                curveTo(14.66f, 12.0f, 11.97f, 14.69f, 11.97f, 18.0f)
                curveTo(11.97f, 19.47f, 12.5f, 20.82f, 13.38f, 21.86f)
                curveTo(13.2f, 21.91f, 13.02f, 21.94f, 12.83f, 21.96f)
                curveTo(11.98f, 22.04f, 11.11f, 22.0f, 10.21f, 21.85f)
                curveTo(6.1f, 21.15f, 2.79f, 17.82f, 2.11f, 13.7f)
                curveTo(0.98f, 6.85f, 6.82f, 1.01f, 13.67f, 2.14f)
                curveTo(17.79f, 2.82f, 21.12f, 6.13f, 21.82f, 10.24f)
                curveTo(21.97f, 11.14f, 22.01f, 12.01f, 21.93f, 12.86f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.83f, 13.41f)
                curveTo(21.69f, 13.9f, 21.43f, 14.34f, 21.06f, 14.71f)
                lineTo(14.68f, 21.09f)
                curveTo(14.31f, 21.46f, 13.87f, 21.72f, 13.38f, 21.86f)
                curveTo(12.5f, 20.82f, 11.97f, 19.47f, 11.97f, 18.0f)
                curveTo(11.97f, 14.69f, 14.66f, 12.0f, 17.97f, 12.0f)
                curveTo(19.44f, 12.0f, 20.79f, 12.53f, 21.83f, 13.41f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
