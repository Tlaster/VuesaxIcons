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

public val LinearGroup.Note21: ImageVector
    get() {
        if (_note21 != null) {
            return _note21!!
        }
        _note21 = Builder(name = "Note21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.66f, 10.44f)
                lineTo(20.68f, 14.62f)
                curveTo(19.84f, 18.23f, 18.18f, 19.69f, 15.06f, 19.39f)
                curveTo(14.56f, 19.35f, 14.02f, 19.26f, 13.44f, 19.12f)
                lineTo(11.76f, 18.72f)
                curveTo(7.59f, 17.73f, 6.3f, 15.67f, 7.28f, 11.49f)
                lineTo(8.26f, 7.3f)
                curveTo(8.46f, 6.45f, 8.7f, 5.71f, 9.0f, 5.1f)
                curveTo(10.17f, 2.68f, 12.16f, 2.03f, 15.5f, 2.82f)
                lineTo(17.17f, 3.21f)
                curveTo(21.36f, 4.19f, 22.64f, 6.26f, 21.66f, 10.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.06f, 19.3901f)
                curveTo(14.44f, 19.8101f, 13.66f, 20.1601f, 12.71f, 20.4701f)
                lineTo(11.13f, 20.9901f)
                curveTo(7.16f, 22.2701f, 5.07f, 21.2001f, 3.78f, 17.2301f)
                lineTo(2.5f, 13.2801f)
                curveTo(1.22f, 9.3101f, 2.28f, 7.2101f, 6.25f, 5.9301f)
                lineTo(7.83f, 5.4101f)
                curveTo(8.24f, 5.2801f, 8.63f, 5.1701f, 9.0f, 5.1001f)
                curveTo(8.7f, 5.7101f, 8.46f, 6.4501f, 8.26f, 7.3001f)
                lineTo(7.28f, 11.4901f)
                curveTo(6.3f, 15.6701f, 7.59f, 17.7301f, 11.76f, 18.7201f)
                lineTo(13.44f, 19.1201f)
                curveTo(14.02f, 19.2601f, 14.56f, 19.3501f, 15.06f, 19.3901f)
                close()
            }
        }
        .build()
        return _note21!!
    }

private var _note21: ImageVector? = null
