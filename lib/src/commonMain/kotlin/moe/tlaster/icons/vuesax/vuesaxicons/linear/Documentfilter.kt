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

public val LinearGroup.Documentfilter: ImageVector
    get() {
        if (_documentfilter != null) {
            return _documentfilter!!
        }
        _documentfilter = Builder(name = "Documentfilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.35f, 2.0f)
                horizontalLineTo(12.25f)
                curveTo(12.99f, 2.0f, 13.6f, 2.61f, 13.6f, 3.35f)
                verticalLineTo(4.83f)
                curveTo(13.6f, 5.37f, 13.26f, 6.04f, 12.93f, 6.38f)
                lineTo(10.03f, 8.94f)
                curveTo(9.63f, 9.28f, 9.36f, 9.95f, 9.36f, 10.49f)
                verticalLineTo(13.39f)
                curveTo(9.36f, 13.79f, 9.09f, 14.33f, 8.75f, 14.54f)
                lineTo(7.81f, 15.15f)
                curveTo(6.93f, 15.69f, 5.72f, 15.08f, 5.72f, 14.0f)
                verticalLineTo(10.43f)
                curveTo(5.72f, 9.96f, 5.45f, 9.35f, 5.18f, 9.01f)
                lineTo(2.62f, 6.31f)
                curveTo(2.28f, 5.97f, 2.01f, 5.37f, 2.01f, 4.96f)
                verticalLineTo(3.41f)
                curveTo(2.0f, 2.61f, 2.61f, 2.0f, 3.35f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 5.88f, 21.22f, 3.92f, 19.41f, 2.9f)
                curveTo(18.9f, 2.61f, 17.88f, 2.39f, 16.95f, 2.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _documentfilter!!
    }

private var _documentfilter: ImageVector? = null
