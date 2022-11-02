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

public val BrokenGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5197f, 12.05f)
                curveTo(2.0197f, 13.45f, 2.9197f, 14.65f, 4.4197f, 14.65f)
                horizontalLineTo(8.4197f)
                curveTo(9.0197f, 14.65f, 9.5197f, 15.15f, 9.4197f, 15.85f)
                lineTo(8.9197f, 19.05f)
                curveTo(8.7197f, 19.95f, 9.3197f, 20.95f, 10.2197f, 21.25f)
                curveTo(11.0197f, 21.55f, 12.0197f, 21.15f, 12.4197f, 20.55f)
                lineTo(16.5197f, 14.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5193f, 5.65f)
                lineTo(13.4193f, 3.25f)
                curveTo(13.0193f, 2.85f, 12.1193f, 2.65f, 11.5193f, 2.65f)
                horizontalLineTo(7.7193f)
                curveTo(6.5193f, 2.65f, 5.2193f, 3.55f, 4.9193f, 4.75f)
                lineTo(3.7793f, 8.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6191f, 5.65f)
                verticalLineTo(15.45f)
                curveTo(21.6191f, 16.85f, 21.0191f, 17.35f, 19.6191f, 17.35f)
                horizontalLineTo(18.6191f)
                curveTo(17.2191f, 17.35f, 16.6191f, 16.85f, 16.6191f, 15.45f)
                verticalLineTo(5.65f)
                curveTo(16.6191f, 4.25f, 17.2191f, 3.75f, 18.6191f, 3.75f)
                horizontalLineTo(19.6191f)
                curveTo(21.0191f, 3.75f, 21.6191f, 4.25f, 21.6191f, 5.65f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
